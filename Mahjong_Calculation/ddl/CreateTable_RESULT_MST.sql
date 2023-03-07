CREATE TABLE RESULT_MST (
    id int(8) AUTO_INCREMENT NOT NULL, 
    point  NOT NULL, 
    tip  NOT NULL, 
    rank date, 
    create_date date, 
    del_flg boolean defalut 'N' NOT NULL, 
 PRIMARY KEY (id)
)
