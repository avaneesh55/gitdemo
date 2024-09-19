import { Patient } from "./patient";

export interface  Appointment{
  id: string;
  date: string;
  time: string;
  patients: Patient[];
}
