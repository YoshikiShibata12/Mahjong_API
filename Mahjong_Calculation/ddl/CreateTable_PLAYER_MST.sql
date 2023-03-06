CREATE TABLE PLAYER_MST (
    id int(8) AUTO_INCREMENT NOT NULL, 
    playyer_name varchar(40) NOT NULL, 
    h_id int(8)  NOT NULL, 
    create_date date, 
    update_date date, 
    del_flg boolean default 'N' NOT NULL, 
 PRIMARY KEY (id)
)
