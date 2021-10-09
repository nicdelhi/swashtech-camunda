package com.swashtech;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import java.util.Random;
import java.util.logging.Logger;

public class CheckWeatherDelegate implements JavaDelegate {
	private final Logger LOGGER = Logger.getLogger(CheckWeatherDelegate.class.getName());
	@Override
	public void execute(DelegateExecution execution) throws Exception {

		Random rando = new Random();

		execution.setVariable("name", "Jaise");
		execution.setVariable("weatherOk", rando.nextBoolean());
		   LOGGER.info("\n\n  ... CheckWeatherDelegate invoked by "
            + "activtyName='" + execution.getCurrentActivityName() + "'"
            + ", activtyId=" + execution.getCurrentActivityId()
            + ", processDefinitionId=" + execution.getProcessDefinitionId()
            + ", processInstanceId=" + execution.getProcessInstanceId()
            + ", businessKey=" + execution.getProcessBusinessKey()
            + ", executionId=" + execution.getId()
            + ", variables=" + execution.getVariables()
            + " \n\n");
		
	}

}
