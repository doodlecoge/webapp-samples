CREATE TABLE students
(
  id         VARCHAR(10) PRIMARY KEY,
  name       VARCHAR(10),
  sex        VARCHAR(1),
  age        SMALLINT,
  created_at DATE
);

CREATE INDEX idx_student_name ON students (name);


