CREATE TABLE `board` (
  `board_no` int NOT NULL AUTO_INCREMENT,
  `title` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `content` text CHARACTER SET utf8mb4 COLLATE utf8mb4_bin,
  `writer` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `reg_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `upd_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`board_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;



INSERT INTO board ( title, writer, content ) VALUES ('제목01', '작성자01', '내용01');
INSERT INTO board ( title, writer, content ) VALUES ('제목02', '작성자02', '내용02');
INSERT INTO board ( title, writer, content ) VALUES ('제목03', '작성자03', '내용03');
INSERT INTO board ( title, writer, content ) VALUES ('제목04', '작성자04', '내용04');
INSERT INTO board ( title, writer, content ) VALUES ('제목05', '작성자05', '내용05');
