/*
 * Class:   businessRule.standardRule.U06Validation1.U06Validation_1_2580571932290653
 *
 * Date:    2017-01-05
 *
 */

package businessRule.standardRule.U06Validation1;

import businessRule.standardRule.U06Validation1.U06Validation_1_2580571932290653_abstract;
import com.consist.businessRule.common.RuleLibrarySystem;
import com.consist.commonFunctions.expression.Expression;
import com.consist.commonFunctions.expression.FieldValue;
import com.consist.commonFunctions.expression.Operation;
import com.consist.commonFunctions.expression.Value;
import com.consist.commonFunctions.expression.exeption.ExpressionException;
import com.consist.component.common.ExecutionContext;
import com.consist.exceptions.BusinessTaskException;
import com.consist.workflow.condition.parser.ModelerSetValueFormExpression;
import com.consist.workflow.server.BO.BOCondition;
import com.consist.workflow.server.BO.BOExpressionCondition;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import modeler.util.RuleManager;
import xmlGenerator.validation.BODigitalDocument;
import xmlGenerator.validation.BTDigitalDocument;

public class U06Validation_1_2580571932290653 extends U06Validation_1_2580571932290653_abstract {

    // ------------------------------------------------------------------------
    // --- methods                                                          ---
    // ------------------------------------------------------------------------

    protected void run() throws Exception {
        BTDigitalDocument btDigDoc = new BTDigitalDocument(getPoolIdentifier());
        BODigitalDocument boDigDoc = new BODigitalDocument(pBODocument);
        pResult = "";

        validateFieldsForm(btDigDoc,boDigDoc);
        pResult = pResult.equals("") ? null : pResult;
    }

    private void validateFieldsForm(BTDigitalDocument btDigDoc, BODigitalDocument boDigDoc) throws Exception {

        if (conditionIsTrue("|ANNEX(U06)|.fieldfqndr = VALUE('QQ') ", boDigDoc)) {
               pResult += " QQ \n ";
        }

        if (conditionIsTrue("|ANNEX(U06)|.fieldfqndr = VALUE('QQ') ", boDigDoc)) {
               pResult += " QQ \n ";
        }

        if (conditionIsTrue("|ANNEX(U06)|.fieldfqndr = VALUE('QQ') ", boDigDoc)) {
               pResult += " QQ \n ";
        }

        if (conditionIsTrue("|ANNEX(U06)|.fieldfqndr = VALUE('QQ') ", boDigDoc)) {
               pResult += " QQ \n ";
        }
    }

    private void setFieldValue(String pConditionParserDO, BODigitalDocument boDigDoc) throws Exception {
        BOCondition xBOCondition = RuleManager.getInstance().evaluateDsConditionExpression(pConditionParserDO, getPoolIdentifier());
        Expression expression = ((BOExpressionCondition) xBOCondition).getExpression();
        ModelerSetValueFormExpression xModelerSetValueFormExpression = (ModelerSetValueFormExpression) expression;
        Operation xOper = (Operation) xModelerSetValueFormExpression.getpExpressionReal();
        //Obtenemos fieldValue
        FieldValue xFieldValue = (FieldValue) xOper.getLsExpressions().get(0);
        xFieldValue.setObject(boDigDoc.getDocument());
        xOper.getLsExpressions().set(0, xFieldValue);
        Value xConditionResult = xOper.getValue();
    }

    private boolean conditionIsTrue(String pCondition, BODigitalDocument boDigDoc) throws Exception {
        BOCondition xBOCondition = RuleManager.getInstance().evaluateDsConditionExpression(pCondition, getPoolIdentifier());
        try {
            Expression expression = ((BOExpressionCondition) xBOCondition).getExpression();
            expression = processExpression(expression, boDigDoc);
            Value xConditionResult = expression.getValue();
            if (xConditionResult.isBoolean()) {
                return (((Boolean) xConditionResult.getRealValue()).booleanValue());
            }
        } catch (ExpressionException e) {
            log(""+e.getMessage());
        }
        return false;
    }

    private Expression processExpression(Expression pExpression, BODigitalDocument boDigDoc) {
        if (pExpression instanceof Operation) {
            Operation xTemp = (Operation) pExpression;
            for (int i = 0; i < xTemp.getLsExpressions().size(); i++) {
                Expression xExpressionTemp = (Expression) xTemp.getLsExpressions().get(i);
                if (xExpressionTemp instanceof Operation) {
                    xTemp.getLsExpressions().set(i, processExpression(xExpressionTemp, boDigDoc));
                } else if (xExpressionTemp instanceof FieldValue) {
                    FieldValue xFieldValue = (FieldValue) xExpressionTemp;
                    xFieldValue.setObject(boDigDoc.getDocument());
                    xTemp.getLsExpressions().set(i, xFieldValue);
                }
            }
            return xTemp;
        } else if (pExpression instanceof FieldValue) {
            FieldValue xFieldValue = (FieldValue) pExpression;
            xFieldValue.setObject(boDigDoc.getDocument());
            return xFieldValue;
        }
        return pExpression;
    }

} // end U06Validation_1_2580571932290653
