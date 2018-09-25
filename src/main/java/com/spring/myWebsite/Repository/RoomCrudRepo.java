package com.spring.myWebsite.Repository;

import com.spring.myWebsite.Model.Room;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomCrudRepo extends CrudRepository<Room,Long> {

    //can add aditional  Expressions by following rules
    /*
    give return type
    start with findBy
    give Entity attribute name (CamelCase)
    chain sub-attribute name (optional)
    parameter with data type of the entity attribute


    //Simple Query Methods
    List<Student> findByFullTime(boolean fullTime);
    List<Student> findByAge(Integer age);
    List<Student> findByAttendeeLastName(String last);

    //Query Methods with Clauses and Exrpessions
    Student findByAttendeeFirstNameAndAttendeeLastName(String firstName, String lastName);
    Student findByAttendee(Person person);
    List<Student> findByAgeGreaterThan(int minimumAge);
    List<Student> findByAgeLessThan(int maximumAge);
    List<Student> findByAttendeeLastNameIgnoreCase(String lastName);
    List<Student> findByAttendeeLastNameLike(String likeString);
    Student findFirstByOrderByAttendeeLastNameAsc();
    Student findTopByOrderByAgeDesc();
    List<Student> findTop3ByOrderByAgeDesc();

     */
    Room findByRoomNumber (String roomNumber);

    @Query("SELECT roomName,roomNumber,id from Room  where  roomName=:nme")
    Room findRoom(@Param("nme") String name);

    @Query("SELECT roomName from  Room WHERE  id=:id")
    Room findRoomByid(@Param("id") int id);

    Room findRoomByIdEquals(int id);
}
