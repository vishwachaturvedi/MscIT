using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using System.Data.SqlClient;

namespace practical_cie2_039
{
    public partial class admin : Form
    {
        SqlConnection con = new SqlConnection(@"Data Source=.\SQLEXPRESS;AttachDbFilename=C:\Users\Vaishnavi Patel\Desktop\GUI\database_insertion\gui project 039-018\cie2 039\practical_cie2_039\practical_cie2_039\Database1.mdf;Integrated Security=True;User Instance=True");
       SqlCommand cmd;
        SqlDataAdapter adp;
        DataTable dt;
        int DoctorId = 0;



        public admin()
        {
            InitializeComponent();
        }

        private void panel3_Paint(object sender, PaintEventArgs e)
        {

        }

        private void tabControl3_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void dataGridView1_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {

        }

       
        public void display()
        {
            cmd = new SqlCommand("Select * from doctor_table",con);
            con.Open();
            cmd.ExecuteNonQuery();
            dt =new DataTable();
            adp = new SqlDataAdapter(cmd);
            dataGridView_d.DataSource=dt;
            con.Close();
        }
        private void btnView_d_Click(object sender, EventArgs e)
        {
            display();
        }

       

        private void panel4_Paint(object sender, PaintEventArgs e)
        {

        }

        private void dataGridView_d_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {
            DoctorId = Convert.ToInt32(dataGridView1.Rows[e.RowIndex].Cells[0].Value.ToString());
            textBoxDoctorName.Text = dataGridView1.Rows[e.RowIndex].Cells[1].Value.ToString();
            cmbSpecialization.SelectedText = dataGridView1.Rows[e.RowIndex].Cells[1].Value.ToString();
            textBoxContactNumber.Text =dataGridView1.Rows[e.RowIndex].Cells[1].Value.ToString();
            textBoxEmailId.Text = dataGridView1.Rows[e.RowIndex].Cells[1].Value.ToString();
        }

        private void dataGridView3_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {

        }

        private void btnAdd_d_Click(object sender, EventArgs e)
        {

            try
            {

                // get combobox Value
                //String Specializaton = cmbSpecialization.SelectedValue.ToString();

                cmd = new SqlCommand("insert into doctor_insert_table  (doctorName , specialization , Contactnumber , Emailid) values('" + textBoxDoctorName.Text + "', '" + cmbSpecialization.SelectedText + "', '" + Convert.ToInt64(textBoxContactNumber) + "','" + textBoxEmailId.Text + "')", con);

                con.Open();
                cmd.ExecuteNonQuery();
                con.Close();
                MessageBox.Show("Dteails Inserted Successfully!!!");



            }
            catch (Exception ex)
            {
                MessageBox.Show("Error!!" + ex);
            }
        }

        private void panel5_Paint(object sender, PaintEventArgs e)
        {

        }

        private void label8_Click(object sender, EventArgs e)
        {

        }

        private void admin_Load(object sender, EventArgs e)
        {

            //it displays automatic datetime and day
            label8.Text = System.DateTime.Now.ToString();
            label9.Text = System.DateTime.Now.DayOfWeek.ToString();
        }

       
    }
}
