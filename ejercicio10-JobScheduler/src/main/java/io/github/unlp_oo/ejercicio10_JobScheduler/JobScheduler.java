package io.github.unlp_oo.ejercicio10_JobScheduler;

import java.util.ArrayList;
import java.util.List;


public abstract class JobScheduler{

	protected List<JobDescription> jobs;

    public JobScheduler () {
        this.jobs = new ArrayList<>();
    }

    public void schedule(JobDescription job) {
        this.jobs.add(job);
    }

    public void unschedule(JobDescription job) {
        if (job != null) {
            this.jobs.remove(job);
        }
    }

    abstract public String getStrategy();

    public List<JobDescription> getJobs(){
        return new ArrayList<JobDescription>(jobs);
    }

    abstract public JobDescription next();
    

}
	

