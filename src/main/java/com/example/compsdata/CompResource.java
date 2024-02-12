package com.example.compsdata;

import com.example.compsdata.model.Comp;
import com.example.compsdata.services.CompService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comps")
public class CompResource {
    private final CompService compService;

    public CompResource(CompService compService) {
        this.compService = compService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Comp>> getAllComps () {
        List<Comp> comps = compService.getAllComps();
        return new ResponseEntity<>(comps, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Comp> addComp (@RequestBody Comp comp) {
        Comp newComp = compService.addComp(comp);
        return new ResponseEntity<>(newComp, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Comp> updateComp (@RequestBody Comp comp) {
        Comp updatedComp = compService.updateComp(comp);
        return new ResponseEntity<>(updatedComp, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteComp (@PathVariable("id") Long id) {
        compService.deleteComp(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
