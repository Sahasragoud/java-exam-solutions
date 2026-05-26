-- Show a list of all upcoming events a user is registered for in their city, sorted by date. 

use cognizant;

desc events;

select *
from users u
inner join Registrations r
on u.user_id = r.user_id
inner join events e
on r.event_id = e.event_id
where u.city = e.city and e.status = 'upcoming'
order by e.start_date;