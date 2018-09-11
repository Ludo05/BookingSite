package com.spring.myWebsite.Repository;

import com.spring.myWebsite.Model.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomCrudRepo extends CrudRepository<Room,Long> {
}
