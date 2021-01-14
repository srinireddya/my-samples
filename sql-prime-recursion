with recursive numbers (n) AS
(
  SELECT 1
  UNION ALL
  SELECT n + 1 FROM numbers WHERE n < 1000
)
select GROUP_CONCAT(s separator '&')  from (
select concat(n) as s from numbers outer1 where outer1.n != 1 and not exists ( select 1 from numbers internal 
                                       where outer1.n > internal.n and outer1.n % internal.n =0
                                                      and internal.n !=1
                                      )) a;
