package recipe.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import recipe.services.SubjectService;

@Controller
@RequestMapping(value = "observer")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @GetMapping
    public ResponseEntity getLatestRecipe(@RequestParam(name = "testString", required = false) String testString, @RequestParam(name = "testInt", required = false) Integer testInt) {
        subjectService.updateSubjectTestString(testString);
        subjectService.updateSubjectTestInt(testInt);
        return new ResponseEntity(HttpStatus.OK);
    }
}
