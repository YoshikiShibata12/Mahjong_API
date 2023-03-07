CREATE TABLE RECORD_REL (
    p_id int(8)  NOT NULL, 
    h_id int(8)  NOT NULL, 
    UNIQUE KEY(p_id, h_id)
)
