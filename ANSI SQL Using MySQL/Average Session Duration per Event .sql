-- 24. Average Session Duration per Event 
-- Compute the average duration (in minutes) of sessions in each event

select  event_id, avg(
		timestampdiff(MINUTE, start_time, end_time)
) as avg_duration_minutes from sessions
group by event_id;
