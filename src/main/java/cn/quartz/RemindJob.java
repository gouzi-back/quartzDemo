package cn.quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * @Auther:haha
 * @Date:2021/2/21 - 02 - 21 13:22
 * @Description:cn.quartz
 * @Version: 1.0
 */
public class RemindJob implements Job {

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {


            System.out.println("我在执行");

    }
}
