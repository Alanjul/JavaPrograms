//This class demonstrates how to a new station to train route and delete it
//using linkedList
public class RailwayNetwork {
      Node head;
      //method to add a station
      public void addStation(int station)
      {
    	  Node newStation = new Node(station);//new object created
    	  if (head == null)
    	  {
    		  head = newStation;
    	  }else
    	  {
    		  Node lastStation = head;
    		  while(lastStation.next != null)
    		  {
    			  lastStation = lastStation.next;
    			  
    		  }
    		  lastStation.next = newStation;
    	  }
      }
      
      //Method to delete a station on the network
      public void deleteStation(int station)
      {
    	  //traverse the list starting from head and keep track of previous
    	  Node temp = head, prev = null;
    	  //check if the list is not empty and head it'self is data to be deleted
    	  if(temp != null &&temp.data == station)
    	  {
    		  //matches point head to next data
    		  head = temp.next;
    		  return;
    		  
    	  }
    	  //traverse the list to find the node to be deleted
    	  /*  Search for the station to be deleted, keep track of the
         previous station as we need to change temp.next*/
    	  while(temp != null &&temp.data != station)
    	  {
    		  prev = temp;
    		  temp = temp.next;//point the station to next
    	  }
    	  //if station is not available
    	  if(temp == null)
    	  {
    		  return;
    	  }
    	  //set point of next previous to point to next
    	  prev.next = temp.next;
      }
      //prints the linked list
      public void Display()
      {
    	  Node current = head;//current points to head
    	  //traverse util we reach the last node
    	  while(current.next != null)
    	  {
    		  //print the data of current node
    		  System.out.print(current.data + "-");
    		  //move to next node
    		  current = current.next;
    	  }
    	  //print data of last node
    	  System.out.println(current.data);
      }
	public static void main(String[] args) {
		// Current object of the class
		RailwayNetwork network = new RailwayNetwork();
		network.addStation(102);
		network.addStation(502);
		network.addStation(520);
		network.Display();
		network.deleteStation(502);
		network.Display();

	}

}
