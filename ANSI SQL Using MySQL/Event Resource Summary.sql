-- Event Resource Summary 
-- Generate a report showing the number of resources (PDFs, images, links) uploaded for each 
-- event. 

use cognizant;

select e.event_id,count(r.resource_id) as No_of_uploads
from resources r
inner join events e
on r.event_id = e.event_id
group by e.event_id;

