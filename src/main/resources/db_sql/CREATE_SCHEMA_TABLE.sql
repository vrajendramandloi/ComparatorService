DROP TABLE VRAJ_OWNER.TEMP_TABLE1;
CREATE TABLE VRAJ_OWNER.TEMP_TABLE1 (
	TEMP_ID CHAR(6) NOT NULL, 
	SEGMENT_NUMBER INT NOT NULL,
	TEMP_DATE DATE NOT NULL, 
	TEMP_IS_TAKEN INT,
	TEMP_NAME VARCHAR2(30), 
	TEMP_ADDRESS VARCHAR2(100), 
	CONSTRAINT TEMP_TABLE1_PK
	PRIMARY KEY (TEMP_ID, TEMP_NAME));

DROP TABLE VRAJ_OWNER.TEMP_TABLE2;
CREATE TABLE VRAJ_OWNER.TEMP_TABLE2 (
	TEMP_ID CHAR(6) NOT NULL, 
	SEGMENT_NUMBER INT NOT NULL,
	TEMP_DATE DATE NOT NULL, 
	TEMP_NAME VARCHAR2(30),
	CONSTRAINT TEMP_TABLE1_PK
	PRIMARY KEY (TEMP_ID, TEMP_NAME));