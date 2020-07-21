# SpringBoot_Scheduled

整合springboot和scala，使得scala调度sparkJob

用springBoot的Scheduled来调度SparkJob，必要的时候可以结合http接口手动触发


用springboot为容器，调度sparkjob，加redis可以做到job调度组建的高可用，而且可以实现基于http接口或者网页形式的手动触发与一身。
此处只是作为定时器调度的例子，备忘。

设计思路
线上建议结合数据库，记录job调度时间和详细信息及动态，启动job的时候单独启动线程来守护执行过程中的job，并将数据库中加入job执行记录，执行状态为running，请求立刻返回，
job执行完成后，守护线程将更新job执行状态和结果。

job调度高可用设计思路（redis实现分布式锁功能）：
同时调度（job可以错开时间），给redis中的一个set中插入一个相同的标识，谁先插入成功，谁执行。
