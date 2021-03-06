package com.github.cloudyrock.mongock.test.proxy;

import com.github.cloudyrock.mongock.ChangeLog;
import com.github.cloudyrock.mongock.ChangeSet;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @since 04/04/2018
 */
@ChangeLog(order = "5")
public class ProxiesMongockTestResource {

  @ChangeSet(author = "testuser", id = "proxyDbTest", order = "01")
  public void testInsertWithDB(DB db) throws InterruptedException {
    DBCollection coll = db.getCollection("anyCollection");

    coll.insert(new BasicDBObject("value", "value1"));
    coll.insert(new BasicDBObject("value", "value2"));
  }

  @ChangeSet(author = "testuser", id = "ProxyMongoDatabaseTest", order = "02")
  public void testMongoDatabase(MongoDatabase mongoDatabase) {
    System.out.println("invoked ProxyMongoDatabaseTest with db=" + mongoDatabase.toString());
  }

}
