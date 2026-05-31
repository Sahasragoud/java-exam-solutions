-- Count how many sessions are scheduled between 10 AM to 12 PM for each event.  

use cognizant;

select title, 
	   time(start_date) as start_time,  
	   time(end_date) as end_time
	   from events
	   where time(start_date) >= time(100000) and time(end_date) <= time(240000);