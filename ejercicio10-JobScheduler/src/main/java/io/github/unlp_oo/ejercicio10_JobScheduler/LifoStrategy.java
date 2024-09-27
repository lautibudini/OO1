package io.github.unlp_oo.ejercicio10_JobScheduler;

public class LifoStrategy extends JobScheduler{
 
	public LifoStrategy() {
		super();
	}

	@Override
	public String getStrategy() {
		return "Lifo";
	}

	@Override
	public JobDescription next() {
		JobDescription nextJob = jobs.get(jobs.size()-1);
	    this.unschedule(nextJob);
	    return nextJob;
	}
	
	
	
	
	
	
	
}
