SpringAutoWiringByName
======================

Auto-wiring in Spring byName


Spring container looks at the beans on which auto-wire attribute is set to byName in the XML 
configuration file. It then tries to match and wire its properties with the beans defined by 
the same names in the configuration file. If matches are found, it will inject those beans otherwise, 
it will throw exceptions.

As in our example the variable defined of type SpellChecker class in TextEditor class has same name
as that of name of bean id of Class SpellChecker defined in applicationContext.xml

if bean id name's and variable name (in texteditor) class won't be same then exception is thrown.
