public class TextEditor {
   private SpellChecker spellChecker;
   private String name;
   private MyClass myclass;

   public TextEditor()
   {
	   System.out.println("Undercover");
   }
   public TextEditor(SpellChecker spellChecker , String name)
   {
	   System.out.println("Selena");
	   this.spellChecker = spellChecker;
	   this.name = name;
   }
   public void setSpellChecker( SpellChecker spellChecker ){
      this.spellChecker = spellChecker;
   }
   public SpellChecker getSpellChecker() {
      return spellChecker;
   }

   public void setName(String name) {
      this.name = name;
   }
   public String getName() {
      return name;
   }

   public void spellCheck() {
      spellChecker.checkSpelling();
   }
}