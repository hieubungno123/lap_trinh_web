use new_servlet;

-- CREATE TABLE role(
-- 	id bigint NOT NULL PRIMARY KEY auto_increment,
--     name VARCHAR(255) NOT NULL,
--     code varchar(255) not null,
--     createddate timestamp null,
--     modifieddate timestamp null,
--     createdby VARCHAR(255)  NULL,
--     modifiedby VARCHAR(255)  NULL
-- );

-- CREATE TABLE user(
-- 	id bigint NOT NULL PRIMARY KEY auto_increment,
--     username VARCHAR(255) NOT NULL,
--     password VARCHAR(255) NOT NULL,
--     fullname varchar(255)  null,
--     status int not null,
--     roleid bigint NOT NULL,
--     createddate timfk_userrole_userestamp null,
--     modifieddate timestamp null,
--     createdby VARCHAR(255)  NULL,
--     modifiedby VARCHAR(255)  NULL
-- );

-- ALTER TABLE user ADD CONSTRAINT fk_user_role FOREIGN KEY (roleid) REFERENCES role(id);

-- CREATE TABLE news(
-- 	id bigint NOT NULL PRIMARY KEY auto_increment,
--     title VARCHAR(255) NULL,
--     thumbmall VARCHAR(255)  NULL,
--     shortdescriptionn TEXT NULL,
--     content TEXT NULL,
--     categoryid bigint NOT NULL,
--     createddate timestamp null,
--     modifieddate timestamp null,
--     createdby VARCHAR(255)  NULL,
--     modifiedby VARCHAR(255)  NULL
-- );

-- CREATE TABLE category(
-- 	id bigint NOT NULL PRIMARY KEY auto_increment,
--     name VARCHAR(255) NOT NULL,
--     code VARCHAR(255) NOT NULL,
--     createddate timestamp null,
--     modifieddate timestamp null,
--     createdby VARCHAR(255)  NULL,
--     modifiedby VARCHAR(255)  NULL
-- );

-- ALTER TABLE news ADD CONSTRAINT fk_news_category FOREIGN KEY (categoryid) REFERENCES category(id);

CREATE TABLE comment(
	id bigint NOT NULL PRIMARY KEY auto_increment,
    content TEXT NULL,
	user_id bigint NOT NULL,
    new_id bigint NOT NULL,
    createddate timestamp null,
    modifieddate timestamp null,
    createdby VARCHAR(255)  NULL,
    modifiedby VARCHAR(255)  NULL
);

ALTER TABLE comment ADD CONSTRAINT fk_comment_user FOREIGN KEY (user_id) REFERENCES user(id);
ALTER TABLE comment ADD CONSTRAINT fk_comment_news FOREIGN KEY (new_id) REFERENCES news(id);