package Swing;

import javax.swing.JComboBox;

public class ComboboxSuggestion extends JComboBox<Object>{

    public ComboboxSuggestion() {
        setUI(new ComboSuggestionUI());
    }
    
}
