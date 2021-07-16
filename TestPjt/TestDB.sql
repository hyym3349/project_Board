
/* Drop Triggers */

DROP TRIGGER TRI_MP_BOARD_BNO;



/* Drop Tables */

DROP TABLE MP_FILE CASCADE CONSTRAINTS;
DROP TABLE MP_REPLY CASCADE CONSTRAINTS;
DROP TABLE MP_BOARD CASCADE CONSTRAINTS;
DROP TABLE MP_MEMBER CASCADE CONSTRAINTS;



/* Drop Sequences */

DROP SEQUENCE SEQ_MP_BOARD_BNO;




/* Create Sequences */

CREATE SEQUENCE SEQ_MP_BOARD_BNO INCREMENT BY 1 START WITH 1;



/* Create Tables */

CREATE TABLE MP_BOARD
(
	BNO number NOT NULL,
	TITLE varchar2(200) NOT NULL,
	CONTENT clob NOT NULL,
	WRITER number NOT NULL,
	REGDATE timestamp NOT NULL,
	EDITOR number NOT NULL,
	EDITDATE timestamp NOT NULL,
	HIT number DEFAULT 0 NOT NULL,
	DELETED char(1) NOT NULL,
	USERNO number NOT NULL,
	PRIMARY KEY (BNO)
);


CREATE TABLE MP_FILE
(
	FNO number NOT NULL,
	OGNFILENAME varchar2(200) NOT NULL,
	REGDATE timestamp NOT NULL,
	EDITDATE timestamp NOT NULL,
	DELETED char(1) DEFAULT 'N' NOT NULL,
	FILELOC varchar2(50) NOT NULL,
	BNO number NOT NULL,
	PRIMARY KEY (FNO)
);


CREATE TABLE MP_MEMBER
(
	USERNO number NOT NULL,
	USERID varchar2(40) NOT NULL,
	USERPASS varchar2(100) NOT NULL,
	USERNAME varchar2(40) NOT NULL,
	USERBIRTH nvarchar2(13),
	USERNICK varchar2(40) NOT NULL,
	USEREMAIL varchar2(100),
	USERTELL nvarchar2(13),
	USERGENDER char(1) NOT NULL,
	USERREGDATE timestamp NOT NULL,
	USEREDITDATE timestamp NOT NULL,
	PRIMARY KEY (USERNO)
);


CREATE TABLE MP_REPLY
(
	RNO number NOT NULL,
	CONTENT varchar2(4000) NOT NULL,
	REGDATE timestamp NOT NULL,
	EDITDATE timestamp NOT NULL,
	DELETED char(1) DEFAULT 'N' NOT NULL,
	BNO number NOT NULL,
	USERNO number NOT NULL,
	PRIMARY KEY (RNO)
);



/* Create Foreign Keys */

ALTER TABLE MP_FILE
	ADD FOREIGN KEY (BNO)
	REFERENCES MP_BOARD (BNO)
;


ALTER TABLE MP_REPLY
	ADD FOREIGN KEY (BNO)
	REFERENCES MP_BOARD (BNO)
;


ALTER TABLE MP_BOARD
	ADD FOREIGN KEY (USERNO)
	REFERENCES MP_MEMBER (USERNO)
;


ALTER TABLE MP_REPLY
	ADD FOREIGN KEY (USERNO)
	REFERENCES MP_MEMBER (USERNO)
;



/* Create Triggers */

CREATE OR REPLACE TRIGGER TRI_MP_BOARD_BNO BEFORE INSERT ON MP_BOARD
FOR EACH ROW
BEGIN
	SELECT SEQ_MP_BOARD_BNO.nextval
	INTO :new.BNO
	FROM dual;
END;

/




