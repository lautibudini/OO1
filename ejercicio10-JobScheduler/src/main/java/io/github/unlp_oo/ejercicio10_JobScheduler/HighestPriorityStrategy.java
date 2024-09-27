package io.github.unlp_oo.ejercicio10_JobScheduler;

public class HighestPriorityStrategy extends JobScheduler {

	@Override
	public String getStrategy() {
		return "Highest Priority";
	}

	@Override
	public JobDescription next() {
		JobDescription nextJob = jobs.stream()
        .max((j1,j2) -> Double.compare(j1.getPriority(), j2.getPriority()))
        .orElse(null);
    this.unschedule(nextJob);
    return nextJob;
	}
	
	
	
	

}
