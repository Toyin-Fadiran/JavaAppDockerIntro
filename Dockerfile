# Let Docker pull the JDK 11 as a Base Image to create our Image
#FROM openjdk:11
FROM amazoncorretto:11

#Create a Directory on our CONTAINER by the name MyCashBacksApp
#We will copy our code here
RUN mkdir /MyCashBacksApp

#Copy the .class file i.e. MyApp.class from the bin into the /MyCashBacksApp
COPY bin/ /MyCashBacksApp

# Set the directory to execute any future commands
WORKDIR /MyCashBacksApp

# Execute the java command --> java MyApp
CMD java MyApp