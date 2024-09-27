package io.github.unlp_oo.ejercicio10_JobScheduler;

public class MostEffortStrategy extends JobScheduler{

	@Override
	public String getStrategy() {
		return "Mosr Effort";
	}

	@Override
	public JobDescription next() {
		JobDescription nextJob = jobs.stream()
                .max((j1,j2) -> Double.compare(j1.getEffort(), j2.getEffort()))
                .orElse(null);
            this.unschedule(nextJob);
            return nextJob;
	}
	
	

}
