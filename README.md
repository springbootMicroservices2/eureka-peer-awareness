# eureka-peer-awareness

Eureka Peer awewness:-
In windows, you need to modify your hosts file and add a couple of lines like these 
(note that you usually need administrator privileges and save the file without adding an extension, C:\Windows\System32\Drivers\etc):
127.0.0.1 eureka-peer1
127.0.0.1 eureka-peer2

Within the eureka-server-example folder, run these commands in two different terminals:

mvn spring-boot:run -Dspring-boot.run.profiles=peer1
mvn spring-boot:run -Dspring-boot.run.profiles=peer2

And now, the client instances, which are also two different commands to run the same application:

mvn spring-boot:run -Dspring-boot.run.profiles=spanish
mvn spring-boot:run -Dspring-boot.run.profiles=english

