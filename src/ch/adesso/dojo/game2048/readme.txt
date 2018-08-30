
Setup:
======

* Fix "Access restriction: The type 'Application' is not API('C:\Program Files\Java\jre8\lib\ext\jfxrt.jar')"
Add accessrules-entry to .classpath file:

	<classpathentry kind="con" path="org.eclipse.jdt.launching.JRE_CONTAINER/org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType/JavaSE-1.8">
		<accessrules>
            <accessrule kind="accessible" pattern="javafx/**"/>
        </accessrules>	
	</classpathentry>

(For game 2048) 


* Set Workspace encoding to UTF-8

...

