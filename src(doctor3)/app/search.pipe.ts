import { Pipe, PipeTransform } from '@angular/core';
import { Doctor } from '../model/Doctor';

@Pipe({
  name: 'search',
  pure: true
})
export class SearchPipe implements PipeTransform {

  transform(doctors: Doctor[], filter: string) {
    console.log('Filter pipe called!');
    if (doctors.length === 0 || filter === '') {
      return doctors;
    } else {
      return doctors.filter((doc) => {
        return doc.docName.toLowerCase().includes(filter.toLowerCase())/* === filter.toLowerCase()*/
      }
      )
    }
  }

}
