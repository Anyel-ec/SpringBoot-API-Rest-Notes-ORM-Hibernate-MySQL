package top.anyel.hibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import top.anyel.hibernate.models.NoteAppd;

@Repository
public  interface NoteAppdRepository extends JpaRepository<NoteAppd, Long> {


}
