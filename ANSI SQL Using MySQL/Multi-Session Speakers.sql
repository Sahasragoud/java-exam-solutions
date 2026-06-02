-- 17. Multi-Session Speakers 
-- Identify speakers who are handling more than one session across all events. 

select u.full_name, count(s.session_id) as session_count from events e
join sessions s
on s.event_id = e.event_id
join users u
on u.user_id = e.organizer_id
group by e.organizer_id
having session_count > 1;
