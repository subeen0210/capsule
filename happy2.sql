insert into memo VALUES(memo_seq.NEXTVAL, sysdate, 'test', 'testtesttesttest', 'aa.jpg', 13);
insert into happy_memo VALUES(memo_seq.NEXTVAL,22, sysdate, 'test', 'testtesttesttest', null);
insert into happy_memo values(happy_memo_seq.nextval, 22, sysdate, 'ttt','ttttt',null);


select count(*) from happy_memo where b_no = 22;


DELETE memo where b_no = 13;
select * from memo;
select * from bottle;

create sequence happy_bottle_seq;
select * from happy_memo;
select * from happy_bottle;

SELECT happy_bottle_seq.CURRVAL FROM DUAL;
insert into happy_bottle values(happy_bottle_seq.nextval, 'ran', sysdate);
insert into happy_bottle values(happy_bottle_seq.nextval, 'ran', sysdate);
SELECT happy_bottle_seq.currval as b_no FROM dual;


select * from happy_bottle;
DELETE FROM happy_bottle WHERE b_no = 90;
DELETE FROM happy_bottle WHERE b_no BETWEEN 97 AND 99;
