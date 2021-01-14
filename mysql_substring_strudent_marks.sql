select Name from (
select ID, Name, Substring(Name, -3, 3) as lastthree from Students where marks>75 order by lastthree, ID) a
