/**
 * generated by Xtext 2.16.0
 */
package de.fhdo.ewks.ml_example.validation;

import de.fhdo.ewks.ml_example.Context;
import de.fhdo.ewks.ml_example.Ml_examplePackage;
import de.fhdo.ewks.ml_example.Structure;
import de.fhdo.ewks.ml_example.validation.AbstractDataStructureLanguageValidator;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.validation.Check;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class DataStructureLanguageValidator extends AbstractDataStructureLanguageValidator {
  @Check
  public void checkStructureName(final Structure structure) {
    boolean _checkName = structure.checkName();
    boolean _not = (!_checkName);
    if (_not) {
      this.error("Structure name must start with an uppercase letter", structure, 
        Ml_examplePackage.Literals.STRUCTURE__NAME);
    }
  }
  
  @Check
  public void checkUniqueStructures(final Context context) {
    final int duplicateStructureIndex = context.checkUniqueStructures();
    if ((duplicateStructureIndex > (-1))) {
      final Structure duplicateStructure = context.getStructures().get(duplicateStructureIndex);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Duplicate structure ");
      String _name = duplicateStructure.getName();
      _builder.append(_name);
      this.error(_builder.toString(), duplicateStructure, 
        Ml_examplePackage.Literals.STRUCTURE__NAME);
    }
  }
}
