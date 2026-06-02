-- Duplicate Registrations Check 
-- detect if a user has been registered more than once for the same event. 

select * from registrations;

insert into registrations values
(6, 1, 1, curdate());

select user_id, count(*) as reg_count from registrations
group by user_id, event_id
having reg_count> 1;
