package businessRule.standardRule.U06Validation1;


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


public class U06Validation_1_2580571932290653_abstract extends com.consist.businessRule.server.BT.BTProgrammableBusinessRuleSTANDARD{



	protected final void initTest() throws java.lang.Exception{

}//InitTestEnd

	protected void set_IN_pBODocument(xmlGenerator.server.BO.BOGenericDocument pValue) throws java.lang.Exception{

		getGlobalParameterManager().setObject("pBODocument","IN", pValue);
	}
	protected xmlGenerator.server.BO.BOGenericDocument get_IN_pBODocument() throws java.lang.Exception{

		return ((xmlGenerator.server.BO.BOGenericDocument)getGlobalParameterManager().getObject("pBODocument","IN"));}

	protected void set_OUT_pResult(java.lang.String pValue) throws java.lang.Exception{

		getGlobalParameterManager().setObject("pResult","OUT", pValue);
	}
	protected java.lang.String get_OUT_pResult() throws java.lang.Exception{

		return ((java.lang.String)getGlobalParameterManager().getObject("pResult","OUT"));}

protected xmlGenerator.server.BO.BOGenericDocument pBODocument;
protected java.lang.String pResult;


protected final void beforeRun()throws Exception{
	pBODocument = get_IN_pBODocument();

}

protected final void afterRun()throws Exception{
	set_OUT_pResult(pResult);

}

 private com.consist.businessRule.common.RuleLibrarySystem instance_SystemLib = null;

 private com.consist.businessRule.common.RuleLibrarySystem getInstance_SystemLib() throws Exception{

	if(instance_SystemLib == null)    
		instance_SystemLib = new com.consist.businessRule.common.RuleLibrarySystem(getPoolIdentifier());
return instance_SystemLib;
}
 private void clearInstance_SystemLib(){

		instance_SystemLib = null;
}
protected final int getSecond(Time pTime) throws Exception{

	return getInstance_SystemLib().getSecond(pTime);

}
protected final Date getDate(String pDateStr) throws Exception{

	return getInstance_SystemLib().getDate(pDateStr);

}
protected final long diffMinutes(Timestamp pTimestampFrom, Timestamp pTimestampTo) throws Exception{

	return getInstance_SystemLib().diffMinutes(pTimestampFrom, pTimestampTo);

}
protected final int getSecond(Timestamp pTimestamp) throws Exception{

	return getInstance_SystemLib().getSecond(pTimestamp);

}
protected final long diffDays(Date pDateFrom, Date pDateTo) throws Exception{

	return getInstance_SystemLib().diffDays(pDateFrom, pDateTo);

}
protected final String getThrowableMessage(Throwable t) throws Exception{

	return getInstance_SystemLib().getThrowableMessage(t);

}
protected final int getMinute(Time pTime) throws Exception{

	return getInstance_SystemLib().getMinute(pTime);

}
protected final long diffLaborDays(Timestamp pTimestampFrom, Timestamp pTimestampTo) throws Exception{

	return getInstance_SystemLib().diffLaborDays(pTimestampFrom, pTimestampTo);

}
protected final long diffSeconds(Timestamp pTimestampFrom, Timestamp pTimestampTo) throws Exception{

	return getInstance_SystemLib().diffSeconds(pTimestampFrom, pTimestampTo);

}
protected final long diffHours(Timestamp pTimestampFrom, Timestamp pTimestampTo) throws Exception{

	return getInstance_SystemLib().diffHours(pTimestampFrom, pTimestampTo);

}
protected final Timestamp getTimestamp(String pTimestampStr) throws Exception{

	return getInstance_SystemLib().getTimestamp(pTimestampStr);

}
protected final Map executeRule(String pRuleName, String pRuleVersion, Map pArguments, ExecutionContext pExecutionContext, boolean pRollbackOnError) throws Exception{

	return getInstance_SystemLib().executeRule(pRuleName, pRuleVersion, pArguments, pExecutionContext, pRollbackOnError);

}
protected final int getMinute(Timestamp pTimestamp) throws Exception{

	return getInstance_SystemLib().getMinute(pTimestamp);

}
protected final Map executeRule(String pRuleName, String pRuleVersion, Object[] pArguments, boolean pRollbackOnError) throws Exception{

	return getInstance_SystemLib().executeRule(pRuleName, pRuleVersion, pArguments, pRollbackOnError);

}
protected final int getHour(Timestamp pTimestamp) throws Exception{

	return getInstance_SystemLib().getHour(pTimestamp);

}
protected final int getMonth(Date pDate) throws Exception{

	return getInstance_SystemLib().getMonth(pDate);

}
protected final long diffHours(Time pTimeFrom, Time pTimeTo) throws Exception{

	return getInstance_SystemLib().diffHours(pTimeFrom, pTimeTo);

}
protected final Time getTime(Timestamp pTimestamp) throws Exception{

	return getInstance_SystemLib().getTime(pTimestamp);

}
protected final Timestamp getCurrentTimestamp() throws Exception{

	return getInstance_SystemLib().getCurrentTimestamp();

}
protected final Date getCurrentDate() throws Exception{

	return getInstance_SystemLib().getCurrentDate();

}
protected final Date getDate(Timestamp pTimestamp) throws Exception{

	return getInstance_SystemLib().getDate(pTimestamp);

}
protected final String translate(String pString) throws Exception{

	return getInstance_SystemLib().translate(pString);

}
protected final int getYear(Date pDate) throws Exception{

	return getInstance_SystemLib().getYear(pDate);

}
protected final int getDay(Timestamp pTimestamp) throws Exception{

	return getInstance_SystemLib().getDay(pTimestamp);

}
protected final String joinString(String[] pStrings, String pToken) throws Exception{

	return getInstance_SystemLib().joinString(pStrings, pToken);

}
protected final String getMonthName(int pNuMonth) throws Exception{

	return getInstance_SystemLib().getMonthName(pNuMonth);

}
protected final Timestamp getTimestamp(Date pDate, Time pTime) throws Exception{

	return getInstance_SystemLib().getTimestamp(pDate, pTime);

}
protected final Time getCurrentTime() throws Exception{

	return getInstance_SystemLib().getCurrentTime();

}
protected final long diffMinutes(Time pTimeFrom, Time pTimeTo) throws Exception{

	return getInstance_SystemLib().diffMinutes(pTimeFrom, pTimeTo);

}
protected final int getDay(Date pDate) throws Exception{

	return getInstance_SystemLib().getDay(pDate);

}
protected final int getMonth(Timestamp pTimestamp) throws Exception{

	return getInstance_SystemLib().getMonth(pTimestamp);

}
protected final String getThrowableStackTrace(Throwable t) throws Exception{

	return getInstance_SystemLib().getThrowableStackTrace(t);

}
protected final Map executeRule(String pRuleName, String pRuleVersion, List pArguments, boolean pRollbackOnError) throws Exception{

	return getInstance_SystemLib().executeRule(pRuleName, pRuleVersion, pArguments, pRollbackOnError);

}
protected final Map executeRule(String pRuleName, String pRuleVersion, Map pArguments, boolean pRollbackOnError) throws Exception{

	return getInstance_SystemLib().executeRule(pRuleName, pRuleVersion, pArguments, pRollbackOnError);

}
protected final long diffSeconds(Time pTimeFrom, Time pTimeTo) throws Exception{

	return getInstance_SystemLib().diffSeconds(pTimeFrom, pTimeTo);

}
protected final long diffLaborDays(Date pDateFrom, Date pDateTo) throws Exception{

	return getInstance_SystemLib().diffLaborDays(pDateFrom, pDateTo);

}
protected final Time getTime(String pTimeStr) throws Exception{

	return getInstance_SystemLib().getTime(pTimeStr);

}
protected final long diffDays(Timestamp pTimestampFrom, Timestamp pTimestampTo) throws Exception{

	return getInstance_SystemLib().diffDays(pTimestampFrom, pTimestampTo);

}
protected final int getYear(Timestamp pTimestamp) throws Exception{

	return getInstance_SystemLib().getYear(pTimestamp);

}
protected final int getHour(Time pTime) throws Exception{

	return getInstance_SystemLib().getHour(pTime);

}
protected final java.lang.String[] splitString(String pString, String pToken) throws Exception{

	return getInstance_SystemLib().splitString(pString, pToken);

}}