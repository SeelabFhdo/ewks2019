# Eclipse Modeling Framework Examples

This repository contains usage examples of tools from or based on the Eclipse Modeling Framework (EMF) [1]. The usage examples show

- the implementation of an abstract and concrete syntax for a textual language for modeling simple data structures (*used tools:* Xcore and Xtext [2,3]).
- implementation of a model-to-text transformation that derives Java POJOs from models constructed with the aforementioned Data Structure Modeling Language (*used tool:* Acceleo [4]).
- implementation of a model-to-model transformation that derives UML class diagrams from data structure models (*used tool:* ATL [5]).
- models that represent different views on a microservice architecture and which are expressed with the Language Ecosystem for Modeling Microservice Architectures (LEMMA) [8].

To play around with the provided examples, follow these steps:

1. Download one of the predefined Eclipse packages depending on your OS:
   * Linux: [Link](https://github.com/SeelabFhdo/ewks2019/releases/download/v1.0/LEMMA_Linux.zip)
   * OS X: [Link](https://github.com/SeelabFhdo/ewks2019/releases/download/v1.0/LEMMA_OSX.zip)
   * Windows: [Link](https://github.com/SeelabFhdo/ewks2019/releases/download/v1.0/LEMMA_Windows.zip)

2. Clone/Download this repository to your harddrive. 
3. Run the ``eclipse`` executable in the package you downloaded in step 1, create a workspace as requested by the IDE, and import the projects you cloned/downloaded in step 2. Projects can be imported in Eclipse by hitting ``File > Open Projects from File System...``, then choosing the parent folder of the cloned/downloaded projects as ``Import source``, and after the projects were loaded hitting ``Finish``.

Now that you have imported all projects into your workspace, you can try out the usage examples. The execution of the examples is technology-specific.

## Running the Xcore and Xtext Usage Examples

To try out the Xcore and Xtext examples, you have to do the following:
<ol type="a">
<li>
  Right click on the project <code>de.fhdo.ewks.ml_example.xtext</code> which you imported into your workspace in step 3 above and from the context menu choose <code>Run As > Eclipse Application</code>. A new runtime Eclipse instance is opened.
</li>

<li>
  In the runtime Eclipse instance switch to the workbench and create a new <code>Java Project</code> entitled, e.g., <code>Test</code>.
</li>

<li>
  In the new <code>Test</code> project create a file with the extension <code>.struct</code> and the name <code>MyStructure</code>, i.e., the file's full name is <code>MyStructure.struct</code>. Confirm any subsequent dialogs with <code>Yes</code>.
</li>

<li>
  In the open editor showing the empty file <code>MyStructure.struct</code>, enter the following piece of code that conforms to the syntax of the Data Structure Modeling Language:
<pre>
context Accounting {
  structure ParkingSpace {
    string name,
    string description,
    boolean isOpen,
    double longitude,
    double latitude
  }
}
</pre>
</ol>

The editor highlights the code according to what you have seen in MDE Part I.

## Running the Acceleo Example

To try out the Acceleo example, you have to do the following:
<ol type="a">
<li>
  If you still have the runtime Eclipse instance, which you started in step (a) of the previous Xcore and Xtext instruction, close it. Switch to the Eclipse instance that you started in step 3 of the general introducton (see above).  
</li>

<li>
  In the project <code>de.fhdo.ewks.acceleo_example</code> navigate to the file <code>main.mtl</code>, which is located in the project folder <code>/src/de/fhdo/ewks/acceleo_example</code>.
</li>

<li>
  Right click on the <code>main.mtl</code> file and choose <code>Run As > Launch Acceleo Application</code>. In the newly opened window enter the following values:
  <ul>
    <li>Project: <code>de.fhdo.ewks.acceleo_example</code></li>
    <li>Main class: <code>de.fhdo.ewks.acceleo_example.Main</code> (this is the Java-based runner for the Acceleo transformation)</li>
    <li>Model: <code>/de.fhdo.ewks.acceleo_example/model/MetamodelInstance.xmi</code> (this a predefined instance of the Xcore metamodel for the Data Structure Modeling Language that reflects the model you created in step (d) in the previous section; if you want to create a new metamodel instance, i.e., a new model, with custom values (i) double click on the project file <code>/de.fhdo.ewks.acceleo_example/model/ml_example.ecore</code>, (ii) in the opened tree right click on <code>Context</code> and hit <code>Create Dynamic Instance...</code>, (iii) after that, follow the guide "Editing Ecore model instances" [6] to create new model elements with custom values)</li>
    <li>Target: <code>/de.fhdo.ewks.acceleo_example/output</code> (this is the output folder of the Java code resulting from executing the transformation)</li>
  </ul>
</li>

<li>Make sure you selected <code>Java Application</code> as "Runner" and hit <code>Run</code>. The transformation will produce a file called <code>ParkingSpace.java</code> in the project folder <code>output</code>. It corresponds to the model you created in step (d) of the previous section.
</ol>

## Running the ATL Example

To try out the ATL example, you have to do the following:
<ol type="a">
<li>
  If you still have the runtime Eclipse instance, which you started in step (a) of the previous Xcore and Xtext instruction, close it. Switch to the Eclipse instance that you started in step 3 of the general introducton (see above).  
</li>

<li>
  In the project <code>ATL-example</code> navigate to the file <code>DS2UML.atl</code>, which is located in the project folder <code>/src</code>.
</li>

<li>
  Right click on the <code>DS2UML.atl</code> file and choose <code>Run As > ATL transformation</code>. In the newly opened window enter the following values:
  <ul>
    <li>DataStructureModel: <code>/ATL-example/model/ml_example.ecore</code> (this is the Ecore representation of the Xcore metamodel of the Data Structure Modeling Language)</li>
    <li>UML: <code>uri:http://www.eclipse.org/uml2/5.0.0/UML</code> (this represents the current UML metamodel [7])</li>
    <li>IN: <code>/ATL-example/model/MetamodelInstance.xmi</code> (this a predefined instance of the Xcore metamodel for the Data Structure Modeling Language that reflects the model you created in step (d) in the previous section; if you want to create a new metamodel instance, i.e., a new model, with custom values (i) double click on the project file <code>/ATL-example/model/ml_example.ecore</code>, (ii) in the opened tree right click on <code>Context</code> and hit <code>Create Dynamic Instance...</code>, (iii) after that, follow the guide "Editing Ecore model instances" [6] to create new model elements with custom values)</li>
    <li>TYPES: <code>/ATL-example/model/UMLPrimitiveTypes.library.uml</code> (this a definition of UML's primitive types, which is needed to create UML <code>PrimitiveType</code> instances)</li>
    <li>OUT: <code>/ATL-example/output/out.xmi</code> (this is the output file, which contains the UML target instance in the XMI format)</li>
  </ul>
</li>

<li>
Switch to the "Advanced" tab and activate the checkbox <code>Allow inter-model references</code>.
</li>

<li>
Hit <code>Run</code>. The transformation will produce a file called <code>out.xmi</code> in the project folder <code>output</code>. It corresponds to the model you created in step (d) of the previous section, but is a UML class diagram instance.
</li>
</ol>

## Running the LEMMA Examples

To try out the LEMMA examples, you have to do the following:
<ol type="a">
<li>
  Open the project <code>LEMMA-examples</code> which you imported into your workspace in step 3 above.
</li>

<li>
  Within the project you will find different different folders. 
  <ul>
    <li>The <code>domain models</code> folder comprises the domain models <code>Banking.data</code> and <code>Student.data</code> expressed in LEMMA's Domain Data Modeling Language.</li>
    <li>The <code>microservices</code> folder comprises the service models <code>Banking.services</code> and <code>Student.services</code> expressed in LEMMA's Service Modeling Language.</li>
    <li>The <code>operation</code> folder comprises the operation model <code>Architecture.operation</code> expressed in LEMMA's Operation Modeling Language.</li>
    <li>The <code>technology</code> folder comprises the Java technology model (file <code>java.technology</code>) used throughout the lectures. You are invited to explore and play around with it, in case you are curious.</li>
    </ul>
  You can double click on each of the mentioned files to open the editor that shows the contained model according to the syntax of the respective modeling language and play around with the models leveraging the editor.

## References
[1] [https://wiki.eclipse.org/EMF](https://wiki.eclipse.org/EMF)  
[2] [https://wiki.eclipse.org/Xcore](https://wiki.eclipse.org/Xcore)  
[3] [https://www.eclipse.org/Xtext](https://www.eclipse.org/Xtext)  
[4] [https://wiki.eclipse.org/Acceleo](https://wiki.eclipse.org/Acceleo)  
[5] [https://www.eclipse.org/atl](https://www.eclipse.org/atl)  
[6] [https://www.ntnu.no/wiki/display/tdt4250/Editing+Ecore+model+instances](https://www.ntnu.no/wiki/display/tdt4250/Editing+Ecore+model+instances)  
[7] [https://www.omg.org/spec/UML/2.5/PDF](https://www.omg.org/spec/UML/2.5/PDF)  
[8] [https://github.com/SeelabFhdo/ddmm](https://github.com/SeelabFhdo/ddmm)
