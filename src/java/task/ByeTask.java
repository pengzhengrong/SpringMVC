package task;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import service.ByeService;

public class ByeTask extends QuartzJobBean{

	private ByeService byeService;
	
	
	public ByeService getByeService() {
		return byeService;
	}


	public void setByeService(ByeService byeService) {
		this.byeService = byeService;
	}


	@Override
	protected void executeInternal(JobExecutionContext arg0)
			throws JobExecutionException {
		// TODO Auto-generated method stub
		String say = byeService.sayBye();
		System.out.println("say:"+say);
	}

}
