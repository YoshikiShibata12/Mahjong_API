CREATE TABLE ACCOUNT_MST (
    id int(8) AUTO_INCREMENT NOT NULL, 
    account_name varchar(40) NOT NULL, 
    create_date date, 
    update_date date, 
    del_flg boolean default 'N' NOT NULL, 
 PRIMARY KEY (id)
)
