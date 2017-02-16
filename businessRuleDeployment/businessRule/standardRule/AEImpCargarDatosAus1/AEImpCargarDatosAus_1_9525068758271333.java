package businessRule.standardRule.AEImpCargarDatosAus1;


import businessRule.standardRule.AEImpCargarDatosAus1.AEImpCargarDatosAus_1_9525068758271333_abstract;
import com.consist.businessRule.common.RuleLibrarySystem;
import com.consist.component.common.ExecutionContext;
import com.consist.seguridad.exception.SeguridadException;
import com.consist.seguridad.server.BO.usuario.BOUsuario;
import com.consist.seguridad.server.BT.usuario.BTUsuario;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tablas.common.components.RuleLibraryTables;
import xmlGenerator.validation.BODigitalDocument;
import xmlGenerator.validation.BTDigitalDocument;


public class AEImpCargarDatosAus_1_9525068758271333 extends AEImpCargarDatosAus_1_9525068758271333_abstract{



	protected void run() throws java.lang.Exception{
HashMap parametros = new HashMap();

BTDigitalDocument btDigDoc = new BTDigitalDocument(getPoolIdentifier());
BODigitalDocument boDigDoc = btDigDoc.readDocument("A15", "idFormulario", pIdFormulario);

parametros.put("pIdEmpleado", (String) btDigDoc.getAttribute(boDigDoc, "cdUsuario"));
parametros.put("pDatosGenerales", true);
//vuelvo a leer autorizante por si se notifica por tercero
parametros.put("pAutorizante", true);

HashMap mapaParametros = new HashMap();
mapaParametros.put("parametros", parametros);

HashMap resultados = (HashMap) executeRule("AELeerEmpleado", "1", mapaParametros, true);
HashMap mapaDatosGen = (HashMap) ((HashMap) resultados.get("pMapaDatos")).get("mapaDatosGenerales");
HashMap mapaDatosAutorizante = (HashMap) ((HashMap) resultados.get("pMapaDatos")).get("mapaDatosAutorizante");

btDigDoc.setAttribute(boDigDoc, "dsNombreAbr", (String) mapaDatosGen.get("dsNombreAbr"));
btDigDoc.setAttribute(boDigDoc, "cdIdLaboral", (String) mapaDatosGen.get("cdIdLaboral"));
btDigDoc.setAttribute(boDigDoc, "cdLegajo", (String) mapaDatosGen.get("cdLegajo"));
btDigDoc.setAttribute(boDigDoc, "dsDir", (String) mapaDatosGen.get("dsDir"));
btDigDoc.setAttribute(boDigDoc, "dsEdificio", (String) mapaDatosGen.get("dsEdificio"));
btDigDoc.setAttribute(boDigDoc, "dsCargo", (String) mapaDatosGen.get("dsCargo"));
btDigDoc.setAttribute(boDigDoc, "dsMailSolicitante", (String) mapaDatosGen.get("dsMailEmpleado"));

if (((String) mapaDatosAutorizante.get("snAutorizar")).equals("NO")) {
    //SI NO NECESITA AUTORIZACION , CIERRA CON CONFORMIDAD
    btDigDoc.setAttribute(boDigDoc, "snAutorizar", "NO");
    btDigDoc.setAttribute(boDigDoc, "cdEstado", "CCC");
    btDigDoc.setAttribute(boDigDoc, "cdAutorizante", (String) btDigDoc.getAttribute(boDigDoc, "cdUsuario"));
} else {

    btDigDoc.setAttribute(boDigDoc, "cdAutorizante", (String) mapaDatosAutorizante.get("cdUserAutorizante"));
    btDigDoc.setAttribute(boDigDoc, "dsMailAutorizante", (String) mapaDatosAutorizante.get("dsMailAutorizante"));
    btDigDoc.setAttribute(boDigDoc, "snAutorizar", "SI");
}

btDigDoc.updateDocument(boDigDoc);
}//RunEnd

}