package com.tb2_mobileprog.zidanefahrezi_tablecrud.database;

import com.tb2_mobileprog.zidanefahrezi_tablecrud.model.Student;
import com.tb2_mobileprog.zidanefahrezi_tablecrud.model.Subject;
import com.tb2_mobileprog.zidanefahrezi_tablecrud.model.TableRowCount;
import com.tb2_mobileprog.zidanefahrezi_tablecrud.model.TakenSubject;

import java.util.List;

public class QueryContract {

    public interface StudentQuery {
        void createStudent(Student student, QueryResponse<Boolean> response);
        void readStudent(int studentId, QueryResponse<Student> response);
        void readAllStudent(QueryResponse<List<Student>> response);
        void updateStudent(Student student, QueryResponse<Boolean> response);
        void deleteStudent(int studentId, QueryResponse<Boolean> response);
    }

    public interface SubjectQuery {
        void createSubject(Subject subject, QueryResponse<Boolean> response);
        void readAllSubject(QueryResponse<List<Subject>> response);
        void updateSubject(Subject subject, QueryResponse<Boolean> response);
        void deleteSubject(int subjectId, QueryResponse<Boolean> response);
    }

    public interface TakenSubjectQuery {
        void createTakenSubject(int studentId, int subjectId, QueryResponse<Boolean> response);
        void readAllTakenSubjectByStudentId(int studentId, QueryResponse<List<Subject>> response);
        void readAllSubjectWithTakenStatus(int studentId, QueryResponse<List<TakenSubject>> response);
        void deleteTakenSubject(int studentId, int subjectId, QueryResponse<Boolean> response);
    }

    public interface TableRowCountQuery {
        void getTableRowCount(QueryResponse<TableRowCount> response);
    }
}