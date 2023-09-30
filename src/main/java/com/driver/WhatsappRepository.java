package com.driver;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

@Repository
public class WhatsappRepository {
 private  HashMap<Group, List<User>>  groupUserMap;
 private  HashMap<Group,List<Message>> groupMessageMap;

    //group info
    private HashMap<Group, User> adminMap;

    private HashMap<String, User> userHashMap;
    private HashMap<Integer, Message> messageHashMap;
    private HashMap<Message, User> senderMap;

    private int customGroupCount;
    private int messageId;
    private HashSet<String> userMobile;

    public WhatsappRepository() {
        this.messageHashMap = new HashMap<>();
        this.groupMessageMap = new HashMap<Group, List<Message>>();
        this.groupUserMap = new HashMap<Group, List<User>>();
        this.senderMap = new HashMap<Message, User>();
        this.adminMap = new HashMap<Group, User>();
        this.userMobile=new HashSet<String>();
        //registered numbers
        this.userHashMap = new HashMap<>();
        this.customGroupCount = 0;
        this.messageId = 0;
    }
    public String createUser(String name, String mobile) throws Exception {
        if (userMobile.contains(mobile))
            throw new Exception("User already exists");

        userHashMap.put(name, new User(name, mobile));
        userMobile.add(mobile);

        return "SUCCESS";

    }


}
