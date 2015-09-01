package task;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

import service.ByeService;
import service.HelloService;

public class HelloTask extends QuartzJobBean{
	
	@Autowired
	private HelloService helloService;
	
	private ByeService byeService;
	
	
	
	public ByeService getByeService() {
		return byeService;
	}

	public void setByeService(ByeService byeService) {
		this.byeService = byeService;
	}

	public HelloService getHelloService() {
		return helloService;
	}

	public void setHelloService(HelloService helloService) {
		this.helloService = helloService;
	}

	@Override
	protected void executeInternal(JobExecutionContext arg0)
			throws JobExecutionException {
		// TODO Auto-generated method stub
		String say = helloService.sayHello();
		System.out.println("say:"+say);
		
		String bye = byeService.sayBye();
		System.out.println("say:"+bye);
	}

}
