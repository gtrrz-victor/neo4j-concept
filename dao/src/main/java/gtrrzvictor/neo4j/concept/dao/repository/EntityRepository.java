package gtrrzvictor.neo4j.concept.dao.repository;

import gtrrzvictor.neo4j.concept.dao.node.Entity;
import org.springframework.data.neo4j.repository.GraphRepository;

/**
 * Created by victor on 10/10/14.
 */
public interface EntityRepository extends GraphRepository<Entity> {}
