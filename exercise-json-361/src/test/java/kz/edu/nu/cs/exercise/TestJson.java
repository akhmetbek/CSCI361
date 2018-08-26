package kz.edu.nu.cs.exercise;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestJson {
    
    final String s1 = "{\"name\":\"Joe\",\"age\":30,\"number\":\"0-2112\"}";
    final String s2 = "{\"list\":[{\"name\":\"Joe\",\"age\":30,\"number\":\"0-2112\"},{\"name\":\"Mary\",\"age\":30,\"number\":\"1-2249\"}]}";
    final String s3 = "{\"name\":\"Mary\",\"age\":30,\"number\":\"1-2249\"}";
    
    @Test
    public void test_1() {
        MyContact c = MyContact.MakeMyContact(s1);
        assertTrue(c.getName().equals("Joe"));
    }
    
    @Test
    public void test_2() {
        MyContact c = MyContact.MakeMyContact(s1);
        assertTrue(c.getAge() == 30);
    }
    
    @Test
    public void test_3() {
        MyContact c = MyContact.MakeMyContact(s3);
        assertTrue(c.getNumber().equals("1-2249"));
    }
    
    @Test
    public void test_4() {
        ContactList list = ContactList.MakeContactList(s2);
        assertTrue(list.getSize() == 2);
    }
    
    @Test
    public void test_5() {
        ContactList list = ContactList.MakeContactList(s2);
        MyContact c = list.getFirstContact();
        assertTrue(c.getNumber().equals("0-2112"));
    }
    
    @Test
    public void test_6() {
        ContactList list = ContactList.MakeContactList(s2);
        list.removeFirstContact();
        MyContact c = list.getFirstContact();
        assertTrue(c.getNumber().equals("1-2249"));
    }
}
