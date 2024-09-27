package io.github.unlp_oo.ejercicio10_JobScheduler;

public class FifoStrategy extends JobScheduler {

	
	public FifoStrategy() {
		super();
	}


	public JobDescription next() {
		JobDescription nextJob = this.jobs.get(0);;
	    this.unschedule(nextJob);
	    return nextJob;
	}


	@Override
	public String getStrategy(){
		return "Fifo";
	}
	
	
	
	
	
}
