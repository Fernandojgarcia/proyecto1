package businessRule.standardRule.AEImpCargarDatosAus1;


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


public class AEImpCargarDatosAus_1_9525068758271333_abstract extends com.consist.businessRule.server.BT.BTProgrammableBusinessRuleSTANDARD{



	protected final void initTest() throws java.lang.Exception{

}//InitTestEnd

	protected void set_IN_pIdFormulario(java.lang.Integer pValue) throws java.lang.Exception{

		getGlobalParameterManager().setObject("pIdFormulario","IN", pValue);
	}
	protected java.lang.Integer get_IN_pIdFormulario() throws java.lang.Exception{

		return ((java.lang.Integer)getGlobalParameterManager().getObject("pIdFormulario","IN"));}

protected java.lang.Integer pIdFormulario;


protected final void beforeRun()throws Exception{
	pIdFormulario = get_IN_pIdFormulario();

}

protected final void afterRun()throws Exception{

}

 private tablas.common.components.RuleLibraryTables instance_1 = null;

 private tablas.common.components.RuleLibraryTables getInstance_1() throws Exception{

	if(instance_1 == null)    
		instance_1 = new tablas.common.components.RuleLibraryTables(getPoolIdentifier());
return instance_1;
}
 private void clearInstance_1(){

		instance_1 = null;
}
 private com.consist.businessRule.common.RuleLibrarySystem instance_2 = null;

 private com.consist.businessRule.common.RuleLibrarySystem getInstance_2() throws Exception{

	if(instance_2 == null)    
		instance_2 = new com.consist.businessRule.common.RuleLibrarySystem(getPoolIdentifier());
return instance_2;
}
 private void clearInstance_2(){

		instance_2 = null;
}
protected final int getSecond(Time pTime) throws Exception{

	return getInstance_2().getSecond(pTime);

}
protected final Date getDate(String pDateStr) throws Exception{

	return getInstance_2().getDate(pDateStr);

}
protected final long diffMinutes(Timestamp pTimestampFrom, Timestamp pTimestampTo) throws Exception{

	return getInstance_2().diffMinutes(pTimestampFrom, pTimestampTo);

}
protected final int getSecond(Timestamp pTimestamp) throws Exception{

	return getInstance_2().getSecond(pTimestamp);

}
protected final long diffDays(Date pDateFrom, Date pDateTo) throws Exception{

	return getInstance_2().diffDays(pDateFrom, pDateTo);

}
protected final String getThrowableMessage(Throwable t) throws Exception{

	return getInstance_2().getThrowableMessage(t);

}
protected final int getMinute(Time pTime) throws Exception{

	return getInstance_2().getMinute(pTime);

}
protected final long diffLaborDays(Timestamp pTimestampFrom, Timestamp pTimestampTo) throws Exception{

	return getInstance_2().diffLaborDays(pTimestampFrom, pTimestampTo);

}
protected final long diffHours(Timestamp pTimestampFrom, Timestamp pTimestampTo) throws Exception{

	return getInstance_2().diffHours(pTimestampFrom, pTimestampTo);

}
protected final long diffSeconds(Timestamp pTimestampFrom, Timestamp pTimestampTo) throws Exception{

	return getInstance_2().diffSeconds(pTimestampFrom, pTimestampTo);

}
protected final void createRecord(String pIdTable, Map pMapsNamesValues, BOUsuario pUser) throws Exception{

	getInstance_1().createRecord(pIdTable, pMapsNamesValues, pUser);

}
protected final Timestamp getTimestamp(String pTimestampStr) throws Exception{

	return getInstance_2().getTimestamp(pTimestampStr);

}
protected final Map executeRule(String pRuleName, String pRuleVersion, Map pArguments, ExecutionContext pExecutionContext, boolean pRollbackOnError) throws Exception{

	return getInstance_2().executeRule(pRuleName, pRuleVersion, pArguments, pExecutionContext, pRollbackOnError);

}
protected final int getMinute(Timestamp pTimestamp) throws Exception{

	return getInstance_2().getMinute(pTimestamp);

}
protected final Map[] searchTableRecords(String pTableId, Map pCriteria) throws Exception{

	return getInstance_1().searchTableRecords(pTableId, pCriteria);

}
protected final Map executeRule(String pRuleName, String pRuleVersion, Object[] pArguments, boolean pRollbackOnError) throws Exception{

	return getInstance_2().executeRule(pRuleName, pRuleVersion, pArguments, pRollbackOnError);

}
protected final int getHour(Timestamp pTimestamp) throws Exception{

	return getInstance_2().getHour(pTimestamp);

}
protected final int getMonth(Date pDate) throws Exception{

	return getInstance_2().getMonth(pDate);

}
protected final long diffHours(Time pTimeFrom, Time pTimeTo) throws Exception{

	return getInstance_2().diffHours(pTimeFrom, pTimeTo);

}
protected final Time getTime(Timestamp pTimestamp) throws Exception{

	return getInstance_2().getTime(pTimestamp);

}
protected final Timestamp getCurrentTimestamp() throws Exception{

	return getInstance_2().getCurrentTimestamp();

}
protected final Date getCurrentDate() throws Exception{

	return getInstance_2().getCurrentDate();

}
protected final Date getDate(Timestamp pTimestamp) throws Exception{

	return getInstance_2().getDate(pTimestamp);

}
protected final String translate(String pString) throws Exception{

	return getInstance_2().translate(pString);

}
protected final int getYear(Date pDate) throws Exception{

	return getInstance_2().getYear(pDate);

}
protected final int getDay(Timestamp pTimestamp) throws Exception{

	return getInstance_2().getDay(pTimestamp);

}
protected final String joinString(String[] pStrings, String pToken) throws Exception{

	return getInstance_2().joinString(pStrings, pToken);

}
protected final String getMonthName(int pNuMonth) throws Exception{

	return getInstance_2().getMonthName(pNuMonth);

}
protected final Timestamp getTimestamp(Date pDate, Time pTime) throws Exception{

	return getInstance_2().getTimestamp(pDate, pTime);

}
protected final Time getCurrentTime() throws Exception{

	return getInstance_2().getCurrentTime();

}
protected final long diffMinutes(Time pTimeFrom, Time pTimeTo) throws Exception{

	return getInstance_2().diffMinutes(pTimeFrom, pTimeTo);

}
protected final int getDay(Date pDate) throws Exception{

	return getInstance_2().getDay(pDate);

}
protected final void updateRecord(String pIdTable, Map pMapsNamesValues, BOUsuario pUser) throws Exception{

	getInstance_1().updateRecord(pIdTable, pMapsNamesValues, pUser);

}
protected final int getMonth(Timestamp pTimestamp) throws Exception{

	return getInstance_2().getMonth(pTimestamp);

}
protected final String getThrowableStackTrace(Throwable t) throws Exception{

	return getInstance_2().getThrowableStackTrace(t);

}
protected final Map executeRule(String pRuleName, String pRuleVersion, List pArguments, boolean pRollbackOnError) throws Exception{

	return getInstance_2().executeRule(pRuleName, pRuleVersion, pArguments, pRollbackOnError);

}
protected final long diffSeconds(Time pTimeFrom, Time pTimeTo) throws Exception{

	return getInstance_2().diffSeconds(pTimeFrom, pTimeTo);

}
protected final Map executeRule(String pRuleName, String pRuleVersion, Map pArguments, boolean pRollbackOnError) throws Exception{

	return getInstance_2().executeRule(pRuleName, pRuleVersion, pArguments, pRollbackOnError);

}
protected final long diffLaborDays(Date pDateFrom, Date pDateTo) throws Exception{

	return getInstance_2().diffLaborDays(pDateFrom, pDateTo);

}
protected final Object evaluateAsDecisionTable(String pTableId, String pConditionField, Object pConditionValue, String pResultField, Object pOtherwiseValue) throws Exception{

	return getInstance_1().evaluateAsDecisionTable(pTableId, pConditionField, pConditionValue, pResultField, pOtherwiseValue);

}
protected final Time getTime(String pTimeStr) throws Exception{

	return getInstance_2().getTime(pTimeStr);

}
protected final long diffDays(Timestamp pTimestampFrom, Timestamp pTimestampTo) throws Exception{

	return getInstance_2().diffDays(pTimestampFrom, pTimestampTo);

}
protected final int getYear(Timestamp pTimestamp) throws Exception{

	return getInstance_2().getYear(pTimestamp);

}
protected final int getHour(Time pTime) throws Exception{

	return getInstance_2().getHour(pTime);

}
protected final java.lang.String[] splitString(String pString, String pToken) throws Exception{

	return getInstance_2().splitString(pString, pToken);

}
protected final Map readTableRecord(String pTableId, Map pKey) throws Exception{

	return getInstance_1().readTableRecord(pTableId, pKey);

}}