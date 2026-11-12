package inventory;

public class World {

    public static void main(String[] args) {

        Game.printFile(); 

        Room currentRoom = buildWorld();
        System.out.println(currentRoom.getItems()); 

        System.out.println(currentRoom); 

        currentRoom = currentRoom.getExit(0); 
        System.out.println(currentRoom); 

        currentRoom = currentRoom.getExit(3); 
        System.out.println(currentRoom); 

        currentRoom = currentRoom.getExit(1); 
        System.out.println(currentRoom); 

        currentRoom = currentRoom.getExit(0); 
        System.out.println(currentRoom); 

        currentRoom = currentRoom.getExit(3); 
        System.out.println(currentRoom); 

        currentRoom = currentRoom.getExit(1); 
        System.out.println(currentRoom); 

        currentRoom = currentRoom.getExit(1); 
        System.out.println(currentRoom); 

        currentRoom = currentRoom.getExit(1); 
        System.out.println(currentRoom); 

        currentRoom = currentRoom.getExit(2); 
        System.out.println(currentRoom); 

        currentRoom = currentRoom.getExit(2); 
        System.out.println(currentRoom); 

        currentRoom = currentRoom.getExit(2); 
        System.out.println(currentRoom); 


        

        currentRoom = currentRoom.getExit(0); 
        System.out.println(currentRoom); 

        currentRoom = currentRoom.getExit(3); 
        System.out.println(currentRoom); 

        currentRoom = currentRoom.getExit(3); 
        System.out.println(currentRoom); 


        

        currentRoom = currentRoom.getExit(5); 
        System.out.println(currentRoom); 


        

        currentRoom = currentRoom.getExit(1); 
        System.out.println(currentRoom); 

        currentRoom = currentRoom.getExit(1); 
        System.out.println(currentRoom); 

        currentRoom = currentRoom.getExit(1); 
        System.out.println(currentRoom); 

        currentRoom = currentRoom.getExit(2); 
        System.out.println(currentRoom); 

        currentRoom = currentRoom.getExit(2); 
        System.out.println(currentRoom); 

        currentRoom = currentRoom.getExit(0); 
        System.out.println(currentRoom); 

        currentRoom = currentRoom.getExit(3); 
        System.out.println(currentRoom); 

        currentRoom = currentRoom.getExit(3); 
        System.out.println(currentRoom); 

        currentRoom = currentRoom.getExit(0); 
        System.out.println(currentRoom); 


        

        currentRoom = currentRoom.getExit(4); 
        System.out.println(currentRoom); 
    }


    public static Room buildWorld() {


    	Room yanas_office = new Room("yanas_office");

    	Room wests_office = new Room("wests_office");

    	Room Daubers_office = new Room("Daubers_office");

    	Room johns_office = new Room("johns_office");

    	Room restroom = new Room("restroom");

    	Room classroom1 = new Room("classroom1");

    	Room classroom2 = new Room("classroom2");

    	Room classroom3 = new Room("classroom3");

    	Room Fischbachs_office = new Room("Fischbachs_office");

    	Room WU_Cast_station = new Room("WU_Cast_station");

    	Room TV_studio = new Room("TV_studio");

    	Room Control_room = new Room("Control_room");

    	Room Lecture_hall = new Room("Lecture_hall");

    	Room Classroom_5 = new Room("Classroom_5");

    	Room Restroom_2 = new Room("Restroom_2");

    	Room lobby = new Room("lobby");

    	Room upstairs_restroom_2 = new Room("upstairs_restroom_2");

    	Room first_floor_stairs = new Room("First Floor Stairs");

    	Room second_floor_stairs = new Room("Second Floor Stairs");
        Room outside = new Room("outside");

        Items book = new Items("notebook", false) ;
        Items paper = new Paper() ;
        Items thumbdrive = new ThumbDrive() ;
        Items addressbook = new AddressBook() ;
        
    	

        Control_room.addExit(TV_studio, 0);          
        TV_studio.addExit(Control_room, 1);          

        Control_room.addExit(Lecture_hall, 3);       
        Lecture_hall.addExit(Control_room, 2);       

        Lecture_hall.addExit(classroom3, 3);         
        classroom3.addExit(Lecture_hall, 2);         

        classroom3.addExit(Restroom_2, 0);           
        Restroom_2.addExit(classroom3, 1);           

        Restroom_2.addExit(lobby, 0);                
        lobby.addExit(Restroom_2, 1);                

        lobby.addExit(WU_Cast_station, 2);           
        WU_Cast_station.addExit(lobby, 3);           

        WU_Cast_station.addExit(TV_studio, 2);       
        TV_studio.addExit(WU_Cast_station, 3);       

        lobby.addExit(first_floor_stairs, 0);        
        first_floor_stairs.addExit(lobby, 1);        


        

        first_floor_stairs.addExit(second_floor_stairs, 4); 
        second_floor_stairs.addExit(first_floor_stairs, 5); 


        

        yanas_office.addExit(Fischbachs_office, 0);  
        Fischbachs_office.addExit(yanas_office, 1);  

        yanas_office.addExit(Daubers_office, 3);     
        Daubers_office.addExit(yanas_office, 2);     

        Daubers_office.addExit(johns_office, 3);     
        johns_office.addExit(Daubers_office, 2);     

        
        Daubers_office.addExit(wests_office, 1);     
        wests_office.addExit(Daubers_office, 0);     

        johns_office.addExit(classroom2, 3);         
        classroom2.addExit(johns_office, 2);         

        classroom2.addExit(restroom, 0);             
        restroom.addExit(classroom2, 1);             

        restroom.addExit(upstairs_restroom_2, 0);    
        upstairs_restroom_2.addExit(restroom, 1);    

        upstairs_restroom_2.addExit(second_floor_stairs, 0); 
        second_floor_stairs.addExit(upstairs_restroom_2, 1); 

        second_floor_stairs.addExit(classroom1, 2);  
        classroom1.addExit(second_floor_stairs, 3);  

        classroom1.addExit(Fischbachs_office, 2);    
        Fischbachs_office.addExit(classroom1, 3);    

        classroom1.addExit(Classroom_5, 1);          
        Classroom_5.addExit(classroom1, 0);          
        
        lobby.addExit(outside, 3);

        classroom1.setIslocked(true);
        classroom2.setIslocked(true);
        classroom3.setIslocked(true);
        Classroom_5.setIslocked(true);
        outside.setIslocked(true);
        outside.setDescription("You escaped Freedom Hall! Congratulations!");

        yanas_office.addItem(new Items("computer", true));
        wests_office.addItem(new Items("computer", true));
        Daubers_office.addItem(new Items("computer", true));
        johns_office.addItem(new Items("computer", true));
        Fischbachs_office.addItem(new Items("computer", true));

        johns_office.addItem(new Rack());
        Fischbachs_office.addItem(new Desk());
        Daubers_office.addItem(new DeskKey());
        Control_room.addItem(new Checklist());
        lobby.addItem(new Binder());

        Daubers_office.setItems(book);
        Daubers_office.setItems(paper);
        Fischbachs_office.setItems(thumbdrive);
        yanas_office.setItems(addressbook);
        
        
        return yanas_office;
    }
}