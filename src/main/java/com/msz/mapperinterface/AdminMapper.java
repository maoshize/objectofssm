package main.java.com.msz.mapperinterface;

import java.util.LinkedList;

import main.java.com.msz.entity.Department;
import main.java.com.msz.entity.Position;
import main.java.com.msz.entity.PositionAndDepartment;
import main.java.com.msz.entity.Training;
import main.java.com.msz.entity.UserDetail;

public interface AdminMapper {
	int fireStuff(Integer ud_id);

	void deleteUserDetail(Integer u_id);

	LinkedList<UserDetail> checkPositionAndStuff();

	LinkedList<Department> getAllDepartment();

	LinkedList<Position> getAllPosition();

	LinkedList<Training> getAllTraining();

	LinkedList<PositionAndDepartment> getAllPositionAndDepartment();

	Object deletePosition(Integer p_id);

	void addPosition(Position position);
}
